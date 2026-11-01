/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* temp=head;
        vector<int> arr;
    while(temp!=nullptr){
        if(temp->val!=val)arr.push_back(temp->val);
        temp=temp->next;
        }
        if(arr.size()==0)return nullptr;
        head= new ListNode(arr[0]);
        ListNode* mover= head;
        for(int i = 1; i < arr.size(); i++){
            ListNode* temp= new ListNode(arr[i]); 
            mover->next = temp; 
            mover=temp;
        }
        return head; 
        
    }
};