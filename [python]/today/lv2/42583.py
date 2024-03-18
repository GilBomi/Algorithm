from collections import deque


def solution(bridge_length, weight, truck_weights):
    answer = 0
    road=deque([0]*bridge_length)
    truck_weights=deque(truck_weights)
    weight_sum=0
    while truck_weights:
        outTruck=road.popleft()
        weight_sum-=outTruck
        if weight_sum+truck_weights[0]<=weight:
            truck=truck_weights.popleft()
            road.append(truck)
            weight_sum+=truck
        else:
            road.append(0)
        answer+=1
    while weight_sum!=0:
        truck=road.popleft()
        weight_sum-=truck
        road.append(0)
        answer+=1
        
    print(road,answer)

    return answer

if __name__=="__main__":
    print(solution(2,10,[7,4,5,6]))