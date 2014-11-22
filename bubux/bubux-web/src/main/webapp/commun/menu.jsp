<%@ taglib prefix="s" uri="/struts-tags" %>
<s:url id='accueil' namespace="/" action='accueil'/>
<s:url id='accueilTest' namespace="/" action='accueilTest'/>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Bubux</a>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<s:if test="codeMenu==1">
					<li class="active"><a href="${accueil}">Accueil</a></li>
				</s:if>
				<s:else>
					<li><a href="${accueil}">Accueil</a></li>
				</s:else>
				
				<s:if test="codeMenu==2">
					<li class="active"><a href="${accueilTest}">AccueilTest</a></li>
				</s:if>
				<s:else>
					<li><a href="${accueilTest}">AccueilTest</a></li>
				</s:else>
				
				<s:if test="codeMenu==3">
					<li class="active"><a href="#contact">Contact</a></li>
				</s:if>
				<s:else>
					<li><a href="#contact">Contact</a></li>
				</s:else>
				
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li class="divider"></li>
						<li class="dropdown-header">Nav header</li>
						<li><a href="#">Separated link</a></li>
						<li><a href="#">One more separated link</a></li>
					</ul>
				</li>
			</ul>
			<div class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" role="form">
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control">
					</div>
					<button type="submit" class="btn btn-success">Sign in</button>
				</form>
			</div>
		</div>
		<!--/.nav-collapse -->
	</div>
</div>