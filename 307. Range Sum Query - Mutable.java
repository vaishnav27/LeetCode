class NumArray {
    class SegmentTree {
        int start, end;
        SegmentTree left, right;
        int sum;

        SegmentTree(int start, int end) {
            this.start = start;
            this.end = end;
            this.left = null;
            this.right = null;
            this.sum = 0;
        }
    }

    SegmentTree root = null;

    public NumArray(int[] nums) {
        root = buildTree(nums, 0, nums.length - 1);
    }

    public SegmentTree buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else {
            SegmentTree ans = new SegmentTree(start, end);
            if (start == end) {
                ans.sum = nums[start];
            } else {
                int mid = start + (end - start) / 2;
                ans.left = buildTree(nums, start, mid);
                ans.right = buildTree(nums, mid + 1, end);
                ans.sum = ans.left.sum + ans.right.sum;
            }
            return ans;
        }
    }

    public void update(int index, int val) {
        updateHelper(root, index, val);
    }

    public void updateHelper(SegmentTree root, int pos, int val) {
        if (root.start == root.end) {
            root.sum = val;
        } else {
            int mid = root.start + (root.end - root.start) / 2;
            if (pos <= mid) {
                updateHelper(root.left, pos, val);
            } else {
                updateHelper(root.right, pos, val);
            }
            root.sum = root.left.sum + root.right.sum;
        }
    }

    public int sumRange(int i, int j) {
        return sumRangeHelper(root, i, j);
    }

    public int sumRangeHelper(SegmentTree root, int start, int end) {
        if (root.end == end && root.start == start) {
            return root.sum;
        } else {
            int mid = root.start + (root.end - root.start) / 2;
            if (end <= mid) {
                return sumRangeHelper(root.left, start, end);
            } else if (start >= mid + 1) {
                return sumRangeHelper(root.right, start, end);
            } else {
                return sumRangeHelper(root.right, mid+1, end) + sumRangeHelper(root.left, start, mid);
            }
        }
    }
}
