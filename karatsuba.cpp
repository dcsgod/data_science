#include <iostream>
#include <string>
#include <algorithm> // for reverse()

using namespace std;

string integerMultiplication(string x, string y) {
    // because it's multiplication of only one-digit numbers, we can use int
    int x_int = stoi(x);
    int y_int = stoi(y);
    string result;
    result = to_string(x_int * y_int);
    return result;
}

// pass by reference so we can make changes instantly and not copy the string
void putZero(string& num, int n) {
    // We can't convert the string into an integer because the number might be too big
    for (int i = 0; i < n; i++) {
        num += "0";
    }
}

string combine(string str1, string str2) {
    // for result:
    string result;

    // We make sure str2 is longer
    if (str1.size() > str2.size()) {
        swap(str1, str2);
    }

    int n1 = str1.size();
    int n2 = str2.size();

    int carry = 0;

    int j = n2 - 1;
    for (int i = n1 - 1; i >= 0; i--) {
        int sum = ((str1[i] - '0') + (str2[j] - '0') + carry);
        result.push_back(sum % 10 + '0');
        j--;
        carry = sum / 10;
    }
    for (; j >= 0; j--) {
        int sum = ((str2[j] - '0') + carry);
        result.push_back(sum % 10 + '0');
        carry = sum / 10;
    }

    if (carry != 0) {
        result.push_back(carry + '0');
    }

    reverse(result.begin(), result.end());

    return result;
}

string karatsuba(string x, string y, int n) {
    if (n != 1) {
        string a = x.substr(0, n / 2);
        string b = x.substr(n / 2);
        string c = y.substr(0, n / 2);
        string d = y.substr(n / 2);

        string ac = karatsuba(a, c, n / 2);
        string bd = karatsuba(b, d, n / 2);
        string ad = karatsuba(a, d, n / 2);
        string bc = karatsuba(b, c, n / 2);

        string ad_plus_bc = combine(ad, bc);

        putZero(ac, n);
        putZero(ad_plus_bc, n / 2);

        string result = combine(combine(ac, ad_plus_bc), bd);
        return result;
    } else {
        return integerMultiplication(x, y);
    }
}

int main() {
    string x = "3141592653589793238462643383279502884197169399375105820974944592";
    string y = "2718281828459045235360287471352662497757247093699959574966967627";

    cout << "x \t= " << x << endl
         << "y \t= " << y << endl
         << endl;

    cout << "Karatsuba Multiplication : " << karatsuba(x, y, x.size()) << endl;

    return 0;
}
