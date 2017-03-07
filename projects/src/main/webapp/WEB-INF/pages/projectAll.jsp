<%--
  Created by IntelliJ IDEA.
  User: GanCF
  Date: 2016/3/2
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>QA门户网站</title>

<!-- Bootstrap Core CSS -->
<link href="/static/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="/static/css/metisMenu.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/static/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="/static/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="/static/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<%--<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>--%>
<%--<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>--%>
<body>
<div id="wrapper">

    <!-- Navigation -->
    <jsp:include page="../pages/template/autodetail.jsp"></jsp:include>

    <div id="page-wrapper">

        <div class="row" >
            <div class="col-lg-12">
                <h1 class="page-header">自动化项目信息</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <ul id="myTab" class="nav nav-tabs">
            <li class="active"><a href="#project" data-toggle="tab">
                已自动化项目</a>
            </li>
        </ul>
        <div class="row" id="autoDetailInfoPanel">
        <div class="tab-content" >
            <div class="tab-pane fade in active"  id="project" >
                <p></p>
                <div class="col-xs-4">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title"></h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body no-padding">
                            <table class="table table-condensed">
                                <tr>
                                    <th>项目id</th>
                                    <th>项目名称</th>
                                </tr>
                                <tr v-for="autoPrjList in detailPanelInfo">
                                    <td>{{autoPrjList.projectid}}</td>
                                    <td>{{autoPrjList.projectname}}</td>
                                </tr>

                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                   <!-- <a href="#" class="list-group-item active">
                        <h4 class="list-group-item-heading">
                            项目名称
                        </h4>
                    </a>
                    <a href="#" class="list-group-item" v-for="autoPrjList of detailPanelInfo.autoPrjList">
                        <p class="list-group-item-text">
                            {{autoPrjList.projectName}}
                        </p>
                    </a>-->
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/static/js/jQuery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/static/js/bootstrap.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="/static/js/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="/static/js/sb-admin-2.min.js"></script>
<script src="/static/js/vue.min.js"></script>
<script src="/static/js/vue-resource.min.js"></script>
    <!--echar-->
<script src="/static/js/echarts.min.js"></script>


<script>

    var panelVw = new Vue({
        el: '#autoDetailInfoPanel',
        data:{
            detailPanelInfo: {},
            apiUrl: '/projectAll/query'
        },
        ready: function(){
            this.initPanelInfoData();
            this.getPanelInfoData();
        },
        methods: {
            initPanelInfoData: function(){
                this.detailPanelInfo = {
                    }
            },
            getPanelInfoData: function(){
                this.$http.get(this.apiUrl).then(function(response){
                    this.$set('detailPanelInfo', response.data);
                }).catch(function(response){
                    console.log(response);
                })
            }
        }
    });

</script>

</body>
</html>

