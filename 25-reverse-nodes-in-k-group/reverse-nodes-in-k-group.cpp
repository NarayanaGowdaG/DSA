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
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* temp=head;
        ListNode* prev=nullptr;
        while(temp!=nullptr){
            ListNode* kNode=findkNode(temp,k);
            if(kNode==nullptr){
                if(prev)prev->next=temp;
                break;
            }
            ListNode* nxtNode=kNode->next;
            kNode->next=nullptr;
            reverse(temp);
            if(temp==head){
                head=kNode;
            }
            else{
                prev->next=kNode;
            }
            prev=temp;
            temp=nxtNode;

        }
        return head;
        
    }
    private:
    ListNode* findkNode(ListNode* temp,int k){
        while(temp!=nullptr){
            k--;
            if(k==0)break;
            temp=temp->next;

        }
        return temp;
 }
    private:
    ListNode* reverse(ListNode* head) {
        if(head==nullptr || head->next==nullptr)return head;
        ListNode* newHead= reverse( head->next);
        ListNode* front=head->next;
        front->next=head;
        head->next=nullptr;
        return newHead;
 
    }
};