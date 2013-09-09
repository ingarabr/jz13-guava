"use strict";

$(document).ready(function () {
    var requests = [];
    $.each($("pre code"), function (index, element) {
        var srcAttr = $(this).attr("data-src");
        if (srcAttr !== undefined) {
            requests.push($.get(srcAttr, function (content) {
                $(element).text(content);
            }));
        }
    });

    $.when.apply($, requests).done(
        function () {
            prettyPrint()
        }
    );

});
