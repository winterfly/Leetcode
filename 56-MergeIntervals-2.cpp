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
    static bool myfunc(const Interval &a, const Interval &b){
        return (a.start < b.start);
    }
    vector<Interval> merge(vector<Interval> &intervals) {
        int n=intervals.size();
        vector<Interval> res;
        if (intervals.size()==0){return res;}
        std::sort(intervals.begin(),intervals.end(),Solution::myfunc);
        res.push_back(intervals[0]);
        for (int i=1;i<n;i++){
            if (res.back().end>=intervals[i].start){
                res.back().end=max(res.back().end,intervals[i].end);
            }else{
                res.push_back(intervals[i]);
            }   
        }
        return res;
    }
};
