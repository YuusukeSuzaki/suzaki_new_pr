<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>資料請求</title>
</head>
<body>
<h1>以下の内容で送信しますが、よろしくて？</h1>
	<dl>
		<dt>名前：</dt>
		<bean:message name="name"/>
		<dd><bean:write name="sendDto" property="name"/></dd>
		<dt>住所：</dt>
		<dd><bean:write name="sendDto" property="address"/></dd>
	</dl>

	<s:form action="complete/">
		<s:submit>完了画面へ</s:submit>
	</s:form>
</body>
</html>