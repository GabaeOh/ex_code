<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="submit-action" method="POST">
        <input type="text" name="commonCodeId" placeholder="COMMON_CODE_ID" required><br>
      
        <input type="text" name="name" placeholder="NAME" required><br>
      
        <input type="text" name="orderNumber" placeholder="ORDER_NUMBER" required><br>
      
        <input type="text" name="attribution1" placeholder="ATTRIBUTION_1" required><br>
      
        <input type="text" name="attribution2" placeholder="ATTRIBUTION_2" required><br>
      
        <input type="text" name="description" placeholder="DESCRIPTION" required><br>
      
        <input type="text" name="systemCodeYn" placeholder="SYSTEM_CODE_YN" required><br>
      
        <input type="text" name="useYn" placeholder="USE_YN" required><br>
      
        <input type="text" name="parentCommonCodeId" placeholder="PARENT_COMMON_CODE_ID" required><br>
      
        <input type="text" name="registerSeq" placeholder="REGISTER_SEQ" required><br>
      
        <input type="text" name="registryDate" placeholder="REGISTRY_DATE" required><br>
      
        <input type="text" name="modifierSeq" placeholder="MODIFIER_SEQ" required><br>
      
        <input type="text" name="modifyDate" placeholder="MODIFY_DATE" required><br>
      
        <input type="submit" value="Submit">
      </form>
</body>
</html>