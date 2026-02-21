class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;

        ArrayList<int[]> sortedTask = new ArrayList<>();

        for(int i = 0; i < n; i++){
            sortedTask.add(new int[]{
                    tasks[i][0],
                    tasks[i][1],
                    i
            });
        }

        // Sort by enqueue time
        Collections.sort(sortedTask,
                (a,b) -> Integer.compare(a[0], b[0])
        );

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> a[0] != b[0]
                        ? Integer.compare(a[0], b[0])
                        : Integer.compare(a[1], b[1])
        );

        ArrayList<Integer> result = new ArrayList<>();

        int idx = 0;
        int currentTime = 0;

        while(idx < n || !pq.isEmpty()){

            if(pq.isEmpty() && idx < n){
                currentTime = Math.max(currentTime, sortedTask.get(idx)[0]);
            }

            while(idx < n && sortedTask.get(idx)[0] <= currentTime){
                pq.offer(new int[]{
                        sortedTask.get(idx)[1], // processing time
                        sortedTask.get(idx)[2]  // index
                });
                idx++;
            }

            if(!pq.isEmpty()){
                int[] task = pq.poll();
                result.add(task[1]);
                currentTime += task[0];
            }
        }

        // Convert ArrayList<Integer> → int[]
        int[] finalResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }
}