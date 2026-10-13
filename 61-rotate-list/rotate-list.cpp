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
    ListNode* rotateRight(ListNode* head, int k) {
    if( head==nullptr)return head;
       
        int len=1;
        ListNode* tail=head;
        while(tail->next!=nullptr){
            len++;
            tail=tail->next;
        }
         if(k%len==0)return head;
         else k=k%len;
        tail->next=head;
        int cnt=len-k;
        ListNode* temp=head;
        while(temp!=nullptr){
            cnt--;
            if(cnt==0)break;
            temp=temp->next;
        }
        head=temp->next;
        temp->next=nullptr;
        
      return head;  
    }
};