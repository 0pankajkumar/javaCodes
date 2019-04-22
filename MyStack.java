//Author - Pankaj Kumar
// Stack using Arrays
class MyStack {
  private static int stackBox[] = new int[6];
  private static int top_pointer = 0;
  public static int push(int data){
    if(top_pointer == -1)
      return -1;
    if(top_pointer > 5)
      return -1;
    else
    {
      stackBox[top_pointer] = data;
      if(top_pointer + 1 > 5)
        top_pointer = 5;
      else
        top_pointer++;
      return 0;
    }
  }

  public static int pop(){
    if(top_pointer == -1)
      return -1;
    if(top_pointer > 6)
      return -1;
    else
    {
      int popped_item = stackBox[top_pointer];
      stackBox[top_pointer] = 0;
      top_pointer -= 1;
      return popped_item;
    }
  }

  public static void display_myStack(){
    System.out.print("[");
    for(int i=0; i<6; i++)
    {
      System.out.print(stackBox[i] + ",");
    }
    System.out.println("]");
  }

  public static void main(String args[]){
    System.out.print("Stack before pushing\n");
    display_myStack();
    System.out.print("\n\n\n");

    //Pushing data
    for(int i=0; i<6; i++)
    {
      push(i*22/7);
    }

    System.out.print("Stack after pushing\n");
    display_myStack();
    System.out.print("\n\n\n");

    System.out.print("Now popping\n");
    while(top_pointer >= 0)
    {
      System.out.println("Now popped : " + pop());
      display_myStack();
    }

    System.out.print("\n");


  }
}
