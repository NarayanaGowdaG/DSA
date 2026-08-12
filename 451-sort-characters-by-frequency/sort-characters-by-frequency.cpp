class Solution {
public:
    string frequencySort(string s) {
            pair<int, char> freq[62];
        for (int i = 0; i < 62; i++) {
            freq[i] = {0, 0};
        }

        for (char ch : s) {
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A'].first++;
                freq[ch - 'A'].second = ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a' + 26].first++;
                freq[ch - 'a' + 26].second = ch;
            }
            else if (ch >= '0' && ch <= '9') {
                freq[ch - '0' + 52].first++;
                freq[ch - '0' + 52].second = ch;
            }
        }

        sort(freq, freq + 62, comparator);

        string ans;
        for (int i = 0; i < 62; i++) {
            if (freq[i].first > 0) {
                for (int j = 0; j < freq[i].first; j++) {
                    ans += freq[i].second;
                }
            }
        }

        return ans;


    }

private:
    static bool comparator(pair<int, char> p1, pair<int, char> p2) {
        if (p1.first > p2.first)
            return true;

        if (p1.first < p2.first)
            return false;

        if( p1.second < p2.second)return true;
        return false;
    }
};