<!DOCTYPE html>
<html>
<body>
	<h2>Hello World!</h2>


	<form action="/Maven2/api/PersonService/delete" method="Put">
		<div align="center" style="color: green;">
			<table>
				<tr>
					<td>Enter ID:</td>
					<td>Enter First Name:</td>
					<td>Enter Last Name:</td>
					<td>Enter Age:</td>
				</tr>
				<tr>
					<td><input type="text" name="id"></td>
					<td><input type="text" name="firstname"></td>
					<td><input type="text" name="lastname"></td>
					<td><input type="text" name="age"></td>
				</tr>
				



			</table>
			<div align="center" style="color: green;">

				<button
					onclick="form.action='/Maven2/api/PersonService/create';form.method='POST';">Add</button>
				<button
					onclick="form.action='/Maven2/api/PersonService/getAll';form.method='get';">Show
					All</button>
				<button
					onclick="form.action='/Maven2/api/PersonService/delete';form.method='delete';">Delete</button>
				<button
					onclick="form.action='/Maven2/api/PersonService/update';form.method='put';">Modify</button>
				<button
					onclick="form.action='/Maven2/api/PersonService/read';form.method='get';">Show
					Information</button>




				<form action="/Maven2/api/PersonService/delete" method="delete">
					<button>another delete button</button>
				</form>
				<form action="/Maven2/api/PersonService/update" method="PUT">
					<button>another put button</button>
				</form>
				</div>
				</div>
	</form>
</body>
</html>
