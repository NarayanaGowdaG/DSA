/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head==nullptr || head->next==nullptr)return nullptr;
        map<ListNode*,int> mpp;
        ListNode* temp=head;
        while(temp!=nullptr){
            if(mpp.find(temp)!=mpp.end())return temp;
            mpp[temp]=1;
            temp=temp->next;
        }
       return nullptr; 
        
    }
};