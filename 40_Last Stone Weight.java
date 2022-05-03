class Solution {
   public int lastStoneWeight(int[] stones) {
	Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	for(int i : stones) maxHeap.offer(i);

	while(!maxHeap.isEmpty() && maxHeap.size() >= 2) {
		int left = maxHeap.poll();
		int right = maxHeap.poll();

		if(left == right) continue;
		else {
			maxHeap.offer(Math.abs(right - left));
		}
	}

	return maxHeap.isEmpty() ? 0 : maxHeap.peek();
}

}