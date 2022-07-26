class FirstUnique {
    Queue<Integer> queue = new LinkedList<Integer>();
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    public FirstUnique(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
          this.add(nums[i]);
        }
    }
    
    public int showFirstUnique() {
        while (!queue.isEmpty() && !map.get(queue.peek())) {
            queue.poll();
        }
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        return -1;
    }
    
    public void add(int value) {
        if (map.containsKey(value))
        {
            map.put(value, false);
        } else {
            map.put(value, true);
            queue.offer(value);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */