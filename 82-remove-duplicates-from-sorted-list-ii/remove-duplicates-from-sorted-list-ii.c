/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode dummyNode;
    dummyNode.next = head;

    struct ListNode* previousNode = &dummyNode;
    struct ListNode* currentNode = head;

    while (currentNode != NULL) {

        if (currentNode->next != NULL &&
            currentNode->val == currentNode->next->val) {

            int duplicateValue = currentNode->val;

            while (currentNode != NULL &&
                   currentNode->val == duplicateValue) {
                currentNode = currentNode->next;
            }

            previousNode->next = currentNode;

        } else {
            previousNode = currentNode;
            currentNode = currentNode->next;
        }
    }

    return dummyNode.next;
}