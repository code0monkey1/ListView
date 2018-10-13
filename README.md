# ListView

/**
 * Step 1 : Put a listView widget inside the layout
 * Step 2 : Define a listView , and  get the listView object by using the findViewById method
 * Step 3 : Create an array / arraylist with the strings ( names ) of your choice
 * Step 4 : next create an ArrayAdapter and the 1st argument is the context ( this ) ,
 * the second argument is the desired layout ( simple list item 1 ,in this case )
 * and the 3rd argument is the name of the array / arrayList object
 * Step 5: next connect the arrayAdapter object with the ListView by using the setAdapter() method
 * of List view and passing in teh arrayAdapter object
 * Step 6 : To enable something to happen when you click the items in a listView ,
 * use the listView's method OnItemClickListener () and pass in an Anonmymous AdapterView.onClickListener
 * and use the onItemClick  method
 *
 * Step 7 : in it which has 4 parameters , the 3rd parameter gives the index of the element,
 * you can use that to get the value of the element ,by using that index
 */
