
public String decodeString(ArrayList<StringPart> parts){
  String str="";
  for(int i=0;i<parts.size();i++)
     {str=str+masterString.substring(part.get(i).getStart(),(part.get(i).getStart()+part.get(i).getLength()));}
  return str;
}
public ArrayList<StringPart> encodeString(String word){
  int i=0;
  ArrayList<StringPart> arr = new ArrayList<StringPart>();
  while(i!=word.length()){
    i=i+findPart(word).getLength();
    arr.add(findPart(word));
    if(i<word.length())
       {word=word.substring(findPart(word).getStart(),(findPart(word).getStart()+findPart(word).getLength()));}
  }
}
    
  

  

      
