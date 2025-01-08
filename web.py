from collections import deque

def min_clicks(graph, start_page, end_page):
    visited = [False] * len(graph)
    distance = [-1] * len(graph)

    queue = deque()
    queue.append(start_page)
    visited[start_page] = True
    distance[start_page] = 0

    while queue:
        current_page = queue.popleft()

        for next_page in graph[current_page]:
            if not visited[next_page]:
                queue.append(next_page)
                visited[next_page] = True
                distance[next_page] = distance[current_page] + 1

    return distance[end_page]

if __name__ == "__main__":
    N = int(input())

    # Initialize the graph with an empty list for each page
    graph = [[] for _ in range(N + 1)]

    # Read the linked pages for each page
    for i in range(1, N + 1):
        linked_pages = list(map(int, input().split()))
        linked_pages_count = linked_pages.pop(0)
        graph[i].extend(linked_pages)

    # Read the start and end pages
    start_page = int(input())
    end_page = int(input())

    print(min_clicks(graph, start_page, end_page))
