/**
 * Definition for an interval.
 * struct Interval {
 *     int start;
 *     int end;
 *     Interval() : start(0), end(0) {}
 *     Interval(int s, int e) : start(s), end(e) {}
 * };
 */
class Solution {
public:
    vector<Interval> insert(vector<Interval>& intervals, Interval newInterval) {
        vector<Interval> res;
        int n=intervals.size();
        bool flag=false;
        for (int i=0;i<n;i++) {
            if (!flag) {
                if (newInterval.end<intervals[i].start) {
                    res.push_back(newInterval);
                    res.push_back(intervals[i]);
                    flag=true;
                } else if (newInterval.start>intervals[i].end) {
                    res.push_back(intervals[i]);
                } else {
                    newInterval.start=min(newInterval.start,intervals[i].start);
                    newInterval.end=max(newInterval.end,intervals[i].end);
                }
            } else {
                    res.push_back(intervals[i]);
            }
        }
        
        if (!flag) res.push_back(newInterval);
        
        return res;
    }
};
