#include <iostream>
#include <cstring>
typedef int Elemtype;
typedef struct node{
    Elemtype data;
    struct node *next;
    node(){
        data = 0;
        next = NULL;
    }
}Linknode;
class MyStack{
public:
    Linknode *head = NULL;
    void InitStack(){
        head = (Linknode *)malloc(sizeof(Linknode));
        head->next = NULL;
        head->data = 0;
        return;
    }
    Elemtype GetTop(){
        if(head->next==NULL)return -1;
        return head->next->data;
    }
    void Push(Elemtype x){
        Linknode *tmp = head->next;
        head->next = (Linknode *)malloc(sizeof(Linknode));
        head->next->data = x;
        head->next->next = tmp;
        return;
    }
    void Pop(){
        Linknode *tmp = head->next;
        head->next = tmp->next;
        free(tmp);
    }
    int GetSize(){
        int cnt = 0;
        Linknode *tmp = head->next;
        while(tmp!=NULL){
            cnt++;
            tmp = tmp->next;
        }
        return cnt;
    }
    void Print(){
        Linknode *tmp = head->next;
        while(tmp!=NULL){
            std::cout<<tmp->data<<' ';
            tmp = tmp->next;
        }
        std::cout<<'\n';
        return;
    }
};
int main() {
    MyStack st;
    st.InitStack();
    st.Push(1);
    st.Push(2);
    st.Print();
    st.Pop();
    st.Print();
    return 0;
}
