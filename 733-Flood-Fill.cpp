class Solution {
private:
    void dfs(int row, int col, vector<vector<int>>& ans, vector<vector<int>>& image, int newColor, int delrow[], int delcol[], int inicolor) {
        // Set the color of the current cell
        ans[row][col] = newColor;

        int n = image.size();
        int m = image[0].size();

        // Explore all 4 directions
        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            // Check bounds and ensure the cell is part of the area to be filled
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == inicolor && ans[nrow][ncol] != newColor) {
                dfs(nrow, ncol, ans, image, newColor, delrow, delcol, inicolor);
            }
        }
    }

public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        int inicolor = image[sr][sc];

        // If the initial color is the same as the new color, no changes are needed
        if (inicolor == newColor) {
            return image;
        }

        vector<vector<int>> ans = image;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, -1, 0, 1};

        dfs(sr, sc, ans, image, newColor, delrow, delcol, inicolor);

        return ans;
    }
};
