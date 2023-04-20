package financialProductAnalysis;

public abstract class FinancialInstitutionComponent {
	
	public void add(FinancialInstitutionComponent  c) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(FinancialInstitutionComponent  c) {
		throw new UnsupportedOperationException();
	}
	
	public FinancialInstitutionComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName(FinancialInstitutionComponent  c) {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription(FinancialInstitutionComponent  c) {
		throw new UnsupportedOperationException();
	}
}
