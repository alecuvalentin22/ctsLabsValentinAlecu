package ro.ase.acs.example;

public class ClassOne {
	
	public float calculateDiscountBasedOnProdAvailAndClientType(ProductType productType, float productPrice, int percentageDiscount)
	  {
	    // float result = 0;
	    float discount = (percentageDiscount > 10) ? (float)30/100 : (float)percentageDiscount/100; 
	    
	    float[] discountProductType = {0f, 0.1f, 0.25f, 0.35f};
	    
	    if(productType.getId() <= ProductType.CRITICAL_AVAILABILITY.getId() && productType.getId() > ProductType.HIGH_AVAILABILITY.getId())
		    if (productType.getId() == 1)
		    {
		    	return productPrice;
		    }
		    else
		    	return (productPrice - (discountProductType[productType.getId() -1] * productPrice)) - 
		    			discount * (productPrice - (discountProductType[productType.getId() -1] * productPrice));
		    else 
		    	return 0;
	    
//	    }
//	    else if (productType == 3)
//	    {
//	    	return (productPrice - (0.25f * productPrice)) - discount * (productPrice - (0.25f * productPrice));
//	    }
//	    else if (productType == 4)
//	    {
//	    	return (productPrice - (0.35f * productPrice)) - discount * (productPrice - (0.35f * productPrice));
//	    }
	    //return 0;
	  }

}
