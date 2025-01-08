from collections import deque

def minimum_clicks(start, end, links):
    print("Running")

    if start == end:
         return 0
    visited = set()
    queue = deque([(start, 0)])

    while queue:

        current, clicks = queue.popleft()
    for link in links[current]:

        if link == end:

            return clicks + 1

        if link not in visited:

            visited.add(link)

        queue.append((link, clicks + 1))

    return -1

