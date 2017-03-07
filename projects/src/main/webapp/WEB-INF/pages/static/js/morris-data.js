$(function() {

    Morris.Area({
        element: 'morris-area-chart',
        data: [{
            date: '2016-11-12',
            baseinfo: 85,
            myt: 74,
            UserMgmt: 80
        }, {
            date: '2016-11-13',
            baseinfo: 79,
            myt: 81,
            UserMgmt: 63
        }, {
            date: '2016-11-14',
            baseinfo: 82,
            myt: 77,
            UserMgmt: 79
        }, {
            date: '2016-11-15',
            baseinfo: 91,
            myt: 84,
            UserMgmt: 88
        }, {
            date: '2016-11-16',
            baseinfo: 62,
            myt: 83,
            UserMgmt: 92
        }, {
            date: '2016-11-17',
            baseinfo: 96,
            myt: 89,
            UserMgmt: 99
        }, {
            date: '2016-11-18',
            baseinfo: 93,
            myt: 81,
            UserMgmt: 92
        }, {
            date: '2016-11-19',
            baseinfo: 99,
            myt: 92,
            UserMgmt: 93
        }, {
            date: '2016-11-20',
            baseinfo: 87,
            myt: 79,
            UserMgmt: 89
        }, {
            date: '2016-11-21',
            baseinfo: 99,
            myt: 99,
            UserMgmt: 99
        }],
        xkey: 'date',
        ykeys: ['baseinfo', 'myt', 'UserMgmt'],
        labels: ['baseinfo', 'myt', 'UserMgmt'],
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });

    Morris.Donut({
        element: 'morris-donut-chart',
        data: [{
            label: "Download Sales",
            value: 12
        }, {
            label: "In-Store Sales",
            value: 30
        }, {
            label: "Mail-Order Sales",
            value: 20
        }],
        resize: true
    });

    Morris.Bar({
        element: 'morris-bar-chart',
        data: [{
            y: '2006',
            a: 100,
            b: 90
        }, {
            y: '2007',
            a: 75,
            b: 65
        }, {
            y: '2008',
            a: 50,
            b: 40
        }, {
            y: '2009',
            a: 75,
            b: 65
        }, {
            y: '2010',
            a: 50,
            b: 40
        }, {
            y: '2011',
            a: 75,
            b: 65
        }, {
            y: '2012',
            a: 100,
            b: 90
        }],
        xkey: 'y',
        ykeys: ['a', 'b'],
        labels: ['Series A', 'Series B'],
        hideHover: 'auto',
        resize: true
    });
    
});
