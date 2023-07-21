#include<stdio.h>
#include<stdlib.h>

struct Node{
	int value;
	struct Node* next;
};

void add_element_last(struct Node* first, int value){
	struct Node* temp2 = (struct Node*)malloc(sizeof(struct Node));
	temp2->value = value;
	temp2->next = NULL;
	struct Node* temp = first;

	while(temp->next != NULL){
		temp = (temp->next);
	}

	temp->next = temp2;
}

struct Node* add_element_first(struct Node* first, int value){
	struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
	temp->value = value;
	temp->next = first;
	return temp;
}

void add_element_after_element(struct Node* element, int value){
	struct Node* temp = (struct Node*)malloc(sizeof(struct Node));
	temp->value = value;
	if (element->next == NULL){
		element->next = temp;
		temp->next = NULL;
	}
	else{
		temp->next = element->next;
		element->next = temp;	
	}
}

struct Node* delete_element(struct Node* first, struct Node* element){
	struct Node* temp = first;

	if(element == first){
		temp = first->next;
		free(element);
		return temp;
	}

	else{
		while(temp->next != element){
			temp = (temp->next);
		}
		if (element->next == NULL){
			temp->next = NULL;
		}
		else{
			temp->next = element->next;
		}
		free(element);
		return first;
	}
}

int main(){
	struct Node* n1;
	struct Node* n2;
	struct Node* n3;
	struct Node* temp;
	struct Node* first;

	n1 = (struct Node*)malloc(sizeof(struct Node));
	n2 = (struct Node*)malloc(sizeof(struct Node));
	n3 = (struct Node*)malloc(sizeof(struct Node));

	n1->value = 2;
	n2->value = 5;
	n3->value = 54;

	n1->next = n2;
	n2->next = n3;
	n3->next = NULL;
	first = n1;

	add_element_last(first, 34);
	first = add_element_first(first, 56);
	add_element_after_element(n2, 46);
	first = delete_element(first , n1);

	temp = first;
	
	do{
		printf("%d\n", temp->value);
		temp = (temp->next);
	}while(temp!=NULL);
}
