<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div>
	<h1>Create Meal plan for today</h1>
	<div class="dropdown">
      <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        old/new plan
      </button>
      <div class="dropdown-menu" aria-labelledby="dropdownMenu2">
        <button class="dropdown-item" type="button">Old</button>
        <button class="dropdown-item" type="button">New</button>

      </div>
    </div>
</div>

<div>
      <div class="btn-group" role="group" aria-label="Basic example">
        <h2>How would You like to count nut. info</h2>
        <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Calories</button>
        <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Product weight</button>
        <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Specific nutrient</button>
      </div>
</div>
<div>
      <div class="btn-group" role="group" aria-label="Basic example">
              <h2>Which nutrient</h2>
              <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Protein</button>
              <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Carbohydrate</button>
              <button type="button" style="height:60px;width:150px" class="btn btn-secondary">Fat</button>
      </div>
</div>
<%@ include file="common/footer.jspf"%>