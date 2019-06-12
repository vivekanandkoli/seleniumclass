package Day2;

public class Xpaths {

	public static void main(String[] args) {



		// XPATHs

		// FireBug is plugin to Firefox to view the page source
		// FirePath is addon to Firebug


		// XPATH is a locator used to identify elements using multiple
		// properties


		// 1. Absolute
		// 2. Relative

		// When to use xpath?
		// 1. When we do not have any property like Id, name, class
		// 2. When the properties are there but they are dynamic
		// 3. When the properties are there but they are not unique






		// <div id="abc" class="xyz">QA </div>
		// <div id="abc" class="pq">Test </div>
		// <div id="abc" class="pq">Test1 </div>

		// syntax of xpath:
		// //tag-name[@propertyname='propertyvalue']

		// //div[@class='xyz']

		// //div[text()='Test1']




		// <div id="abc" class="pq">Test123 </div>


		// //div[contains(text(),'Test')]



















	}
}
