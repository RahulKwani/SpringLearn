<link rel="stylesheet" href="css/Site_Styles.css" type="text/css"
	title="default" />
<!--  jquery core -->
<script src="js/jquery/jquery-1.4.1.min.js" type="text/javascript"></script>

<!-- Custom jquery scripts -->
<script src="js/jquery/custom_jquery.js" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
$(document).pngFix( );
});
</script>
	
<!-- Start: page-top-outer -->
<div id="page-top-outer">

	<!-- Start: page-top -->
	<div id="page-top">

		<!-- start logo -->
		<div id="logo">
			<a href="#"><img src="images/shared/logo.png" alt="" /></a>
		</div>
		<!-- end logo -->

		<!--  start top-search -->
		<div id="top-search">
			<table>
				<tr>
					<td><input type="text" value="Search"
						onblur="if (this.value=='') { this.value='Search'; }"
						onfocus="if (this.value=='Search') { this.value=''; }"
						class="top-search-inp" /></td>
					<td><select class="styledselect">
							<option value="">All</option>
							<option value="">Products</option>
							<option value="">Categories</option>
							<option value="">Clients</option>
					</select></td>
					<td><input type="image" src="images/shared/top_search_btn.gif" /></td>
				</tr>
			</table>
		</div>
		<!--  end top-search -->
		<div class="clear"></div>

	</div>
	<!-- End: page-top -->

</div>
<!-- End: page-top-outer -->

<div class="clear">&nbsp;</div>

<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat">
	<!--  start nav-outer -->
	<div class="nav-outer">

		<!-- start nav-right -->
		<div id="nav-right">

			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account">
				<img src="images/shared/nav/nav_myaccount.gif" width="93"
					height="14" alt="" />
			</div>
			<div class="nav-divider">&nbsp;</div>
			<a href="logout" id="logout"><img
				src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" /></a>
			<div class="clear">&nbsp;</div>

			<!--  start account-content -->
			<div class="account-content">
				<div class="account-drop-inner">
					<a href="" id="acc-settings">Settings</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-details">Personal details </a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-project">Project details</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-inbox">Inbox</a>
					<div class="clear">&nbsp;</div>
					<div class="acc-line">&nbsp;</div>
					<a href="" id="acc-stats">Statistics</a>
				</div>
			</div>
			<!--  end account-content -->

		</div>
		<!-- end nav-right -->


		<!--  start nav -->
		<div class="nav">
			<ul class="select nav-dashboard">
				<li><a href="Dashboard"><b>Dashboard</b> </a></li>
			</ul>

			<span class="nav-divider">&nbsp;</span>

			<ul class="select nav-products">
				<li><a href="Products"><b>Products</b> </a></li>
			</ul>

			<span class="nav-divider">&nbsp;</span>

			<ul class="select nav-categories">
				<li><a href="#nogo"><b>Categories</b> </a></li>
			</ul>

			<span class="nav-divider">&nbsp;</span>

			<ul class="select nav-clients">
				<li><a href="#nogo"><b>Clients</b> </a></li>
			</ul>
			<div class="clear"></div>
		</div>

	</div>
	<!--  start nav -->

</div>
<div class="clear"></div>
<!--  start nav-outer -->
<!--  start nav-outer-repeat................................................... END -->