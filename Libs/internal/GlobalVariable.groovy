package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object title
     
    /**
     * <p></p>
     */
    public static Object body
     
    /**
     * <p></p>
     */
    public static Object userId
     
    /**
     * <p></p>
     */
    public static Object name
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object email_real_mobile
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            url = selectedVariables['url']
            title = selectedVariables['title']
            body = selectedVariables['body']
            userId = selectedVariables['userId']
            name = selectedVariables['name']
            email = selectedVariables['email']
            email_real_mobile = selectedVariables['email_real_mobile']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
