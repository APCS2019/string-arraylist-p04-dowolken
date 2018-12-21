
public String decodeString(ArrayList<StringPart> parts){
  String str="";
  for(int i=0;i<parts.size();i++)
     {str=str+masterString.substring(part.get(i).getStart(),(part.get(i).getStart()+part.get(i).getLength()));}
  return str;
}
public ArrayList<StringPart> encodeString(String word){
  int i=0;
  ArrayList<StringPart> arr = new ArrayList<StringPart>();
  StringPart a;
  while(word.length()!=0){
    a=findPart(word);
    arr.add(a);
    word=word.substring(a.getLength());}
  }
  return arr;
                            
}
    
  

  

      
