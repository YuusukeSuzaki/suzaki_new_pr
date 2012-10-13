<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>資料請求</title>
</head>
<body>
<h1>資料請求しますので、以下の情報を入力してね！！</h1>

	<s:form action="confirm/">
		<dl>
			<dt>名前：</dt>
			<dd><html:text property="name"></html:text></dd>
			<dt>住所：</dt>
			<dd><html:text property="address"></html:text></dd>
		</dl>
		<s:submit value="確認画面へ">
		</s:submit>]
	</s:form>

</body>
</html>