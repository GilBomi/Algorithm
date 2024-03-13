import heapq

def solution(operations):
    answer = []
    heap=[]
    for s in operations:
        s=s.split(" ")
        # print(s[1],int(s[1])<0)
        if s[0]=="I":
            heapq.heappush(heap,int(s[1]))
        else: # "D"
            if len(heap)!=0:
                if int(s[1])<0:
                    heapq.heappop(heap) # 최솟값 삭제
                elif int(s[1])>=0:
                    max_value = max(heap)  # 최댓값을 찾음
                    heap.remove(max_value)  # 최댓값을 제거함
                    heapq.heapify(heap)
                    
    if len(heap)==0:
        return [0,0]
    return [max(heap),min(heap)]

if __name__=="__main__":
    print(solution(["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]))