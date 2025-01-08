def count_coins_and_calories(grid):
    coins_collected = 0
    calories_burned = 0

    for col in range(len(grid[0])):  # For each column
        highest_coin = 0
        hurdle_height = 0
        for row in range(len(grid)):  # From ground up
            if grid[row][col] == 'C':
                highest_coin = max(highest_coin, row)  # Highest coin in the air
            elif grid[row][col] == 'H':
                if (row == 0 or grid[row - 1][col] != 'H') and (highest_coin < row):
                    # It's the top of a hurdle and higher than the highest coin collected
                    hurdle_height = max(hurdle_height, row)
                elif row > 0 and grid[row - 1][col] == '0':
                    # It's a ring hurdle
                    hurdle_height = max(hurdle_height, row - 1)

        # Calories are 2 for each row he jumps, for the highest of coin or hurdle
        jump_height = max(highest_coin, hurdle_height)
        calories_burned += 2 * (jump_height + 1)

        # Add coins collected (0 or 1 per column)
        coins_collected += 1 if highest_coin > 0 else 0

    return coins_collected, calories_burned

# Input handling
M, N = map(int, input().split())
screen_grid = [input() for _ in range(M)]

# Function call
coins, calories = count_coins_and_calories(screen_grid)

# Output
print(coins, calories)
