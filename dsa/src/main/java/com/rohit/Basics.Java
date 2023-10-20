public class Basics{
    private String name;
    private String def;
    private String syntax;
    private List<String> types;
    private List<String> Advantage;
    private Map<String, Object> termology;
    private List<String> operations;
    
    void setBasics(String type){
        if(type.equals("Array")){
            name="Array";
            def="";
            syntax="";
            types.add();
            types.add();
            Advantage.add();
            Advantage.add();
            Advantage.add();
            termology.put("index",0);
            termology.put("elements","arr[index]");
            termology.put("length","arr.length");
            
        }
    }

}