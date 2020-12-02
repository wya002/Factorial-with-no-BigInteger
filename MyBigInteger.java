class MyBigInteger {
		
		
	public ArrayList<Integer> factorial(int a) {
		ArrayList<Integer> x = new ArrayList();
		
		for(int i = a-1 ; i > 0 ; i--) {
				if(x.isEmpty())x.add(a*i);
				else {
					for(int n = 0; n < x.size(); n++) {
						if(x.get(n)>=10) {
							if(n==x.size()-1) {
							x.add(x.get(n)/10);
							x.set(n, x.get(n)%10);
							x.set(n, x.get(n)*i);
							}  
							else{
								 x.set(n+1, x.get(n+1)+(x.get(n)/10));
								 x.set(n, x.get(n)%10);
								 x.set(n, x.get(n)*i);
							 }
							
						} 
						else {	
						x.set(n,x.get(n)*i);
						}
					}
				}
			}
		return x;
	}
}
