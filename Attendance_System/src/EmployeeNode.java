
 
public class EmployeeNode {
	int empId, attCount;
	EmployeeNode left, right;
	
/* Constructor */
    
    public EmployeeNode(int id)
    {
        left = null;
        right = null;
        empId = id;
        attCount=1;
    }
    
    EmployeeNode getRightTree(EmployeeNode p){
    	return p.right;
    }
    
    EmployeeNode getLeftTree(EmployeeNode p){
    	return p.left;
    }
    
    EmployeeNode search(EmployeeNode p, Integer data){
    	if (p == null)
            return null;
         else
         if (data.compareTo(p.empId) == 0){        	
         	return p;
         }
         else
         if (data.compareTo(p.empId) < 0)
            return search(p.left, data);
         else
            return search(p.right, data);
    }
    
    int getCount(){
    	return this.attCount;
    }
    
    int getEmpId(){
    	return this.empId;
    }
    
}
