"use strict";

$(document).ready(function () {
    $.each($("pre code"), function (index, element) {
        console.log("Loading sourcecode ")
        var srcAttr = $(this).attr("data-src");
        if (srcAttr !== undefined) {
            $.get(srcAttr, function (content) {
                $(element).text(content);

            });


        }
    });

    window.postprettyPrint = function() {
        $.each($("pre code"), function (index, element) {
            var span = $(element).parent().children().first();
            if (span.hasClass("pln")) {
                span.remove();
                console.log("Fixing prettyPrint, removing span")
            }
        });
    }


});
