<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Header</h2>
<p>
	Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus
	ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa
	justo sit amet risus. Etiam porta sem malesuada magna mollis euismod.
	Donec sed odio dui. <br />
</p>

<h2>Image</h2>
<p>Create a responsive image (will scale to the parent element). In
	addition: shape the image to a circle:</p>
<img src="images/ibu.jpg" class="img-responsive img-circle" alt="ibu"
	width="304" height="236">

<s:if test="testVariable != null">
	<h2>Service testBO</h2>
	<p>
		Variable r&eacute;cup&eacute;r&eacute;e du service testBO :
		<s:property value="testVariable" />
	</p>
</s:if>