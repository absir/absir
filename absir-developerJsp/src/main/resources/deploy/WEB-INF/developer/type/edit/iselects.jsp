<%@ include file="../../common/edit.jsp"%>
<%
	DeveloperModel model = DeveloperModel.forEntityName(field.getEntityName(), request);
%>
<%
	input.after("<a class=\"btnLook\" href=\"" + pageContext.findAttribute("admin_route") + "/entity/lookup/" + field.getEntityName() + "?suggest=" + field.getName()
			+ "\" lookupGroup=\"\">查找带回</a>");
	String value = input.attr("value");
	element.before(ScripteNode.node("<c:set value=\"" + value + "\" var=\"value\"/>\r\n"));
	element.before(DeveloperCode.script("pageContext.setAttribute(\"value\", EntityStatics.list(\"" + model.getEntityName() + "\", pageContext.findAttribute(\"value\")));"));
	element.before(ScripteNode.node(model.suggests("${value}")));
	input.attr("value", "${values}");
	input.attr("name", field.getName() + "$suggest");
	element.append("<input type=\"hidden\" name=\"" + field.getName() + "\" value=\"${ids}\" />");
	element.before(ScripteNode.node(DeveloperCode.script("session.setAttribute(\"SUGGEST@" + field.getEntityName() + "\", true);")));
%>