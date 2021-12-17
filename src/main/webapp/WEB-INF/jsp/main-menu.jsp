<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<h1>Select Your choise</h1>
	<vaadin-vertical-layout theme="spacing">
	<a href="/meal-planner"><button type="button"  class="btn btn-primary btn-lg">Create new plan</button>
	</a>
    <h1><a href="/bmi" type="button" class="btn btn-primary btn-lg">Check BMI status</a></h1>
        <h1><a href="/recipe/show-form"><button type="button" class="btn btn-primary btn-lg">Add new recipe plan</button><h1>
     <a href = "https://www.who.int/news-room/fact-sheets/detail/obesity-and-overweight"><button type="button" class="btn btn-primary btn-lg">Get inspired    </button></a>
     <h1><a href = "/ingredient/show-form"><button type="button"  class="btn btn-primary btn-lg">Check product nutrition value</button></a></h1>
     <h1><button type="button"  class="btn btn-primary btn-lg">Change settings</button></h1>
</div>
<%@ include file="common/footer.jspf"%>