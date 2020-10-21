#include <iostream>
#include <list>
using namespace std;

// Data structure to store a Binary Tree node
struct Node
{
    int key;
    Node *left, *right;

    Node(int key)
    {
        this->key = key;
        this->left = this->right = nullptr;
    }
};

// Function to check if given Binary Tree is Complete or not
bool isComplete(Node* root)
{
    // return if tree is empty
    if (root == nullptr)
        return false;

    // create an empty queue and enqueue root node
    list<Node*> queue;
    queue.push_back(root);

    // pointer to store current node
    Node* front = nullptr;

    // flag to mark end of full nodes
    bool flag = false;

    // run till queue is not empty
    while (queue.size())
    {
        // pop front node from the queue
        front = queue.front();
        queue.pop_front();

        // if we have encountered a non-full node before and current node
        // is not a leaf, tree cannot be complete tree
        if (flag && (front->left || front->right))
                return false;

        // if left child is empty & right child exists, tree cannot be complete
        if (front->left == nullptr && front->right)
           return false;

        // if left child exists, enqueue it
        if (front->left)
           queue.push_back(front->left);

        // if current node is a non-full node, set flag to true
        else
           flag = true;


        // if right child exists, enqueue it
        if (front->right)
           queue.push_back(front->right);

        // if current node is a non-full node, set flag to true
        else
           flag = true;
    }

    return true;
}

// main function
int main()
{
    Node* root = nullptr;
    /* Construct below tree
              1
           /    \
          2      3
         / \    / \
        4   5  6   7
    */
    
    root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);

    if (isComplete(root))
        cout << "Given binary tree is a Complete Binary Tree";
    else
        cout << "Given binary tree is not a Complete Binary Tree";

    return 0;
}