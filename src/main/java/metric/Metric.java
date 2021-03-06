package metric;

import org.eclipse.jdt.core.dom.CompilationUnit;

import ck.CKNumber;
import ck.CKReport;

public interface Metric {

	void execute(CompilationUnit cu, CKNumber result, CKReport report);
	void setResult(CKNumber result);
}
