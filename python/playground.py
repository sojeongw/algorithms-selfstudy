from collections import deque

n, m = 5, 6

graph = [
    [1, 0, 1, 0, 1, 0],
    [1, 1, 1, 1, 1, 1],
    [0, 0, 0, 0, 0, 1],
    [1, 1, 1, 1, 1, 1],
    [1, 1, 1, 1, 1, 1]
]

# 상 하 좌 우 이동 값을 정의한다.
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    queue = deque()
    # 시작 좌표를 큐에 넣는다.
    queue.append((x, y))

    while queue:
        # 큐에서 처리할 값을 꺼낸다.
        x, y = queue.popleft()
        # 상하좌우를 확인한다.
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 좌표 범위를 벗어나면 다음 방향으로 넘어간다.
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            # 해당 방향이 괴물이면 다음 방향으로 넘어간다.
            if graph[nx][ny] == 0:
                continue
            # 상하좌우 중 갈 수 있는 길을 발견하면
            if graph[nx][ny] == 1:
                # 이동한 흔적을 남기기 위해 이동하는 단계마다 1씩 더한다.
                graph[nx][ny] = graph[x][y] + 1
                # 다음 이동을 위해 이동한 새로운 좌표를 큐에 넣는다.
                queue.append((nx, ny))
    # 출구에 이동한 만큼 1씩 더한 최종 결과가 있으므로 반환한다.
    return graph[n - 1][m - 1]


print(bfs(0, 0))