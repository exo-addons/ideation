@Portlet
@Application(name = "IdeationAdministrationController")
@Bindings({
        @Binding(value = IdeaService.class),
        @Binding(value = RepositoryService.class),
        @Binding(value = IdentityManager.class),

})
@Scripts({
        @Script(id = "jQueryUI", value = "js/lib/jquery-ui.js"),
        // AngularJS is still global, should be AMDified
        @Script(id = "angularjs", value = "js/lib/angular.min.js"),
        @Script(id = "ngSanitize", value = "js/lib/angular-sanitize.js", depends = "angularjs"),
        // services and controllers js are AMD modules, required by controllers.js
        @Script(id = "controllers", value = "js/controllers.js", depends = "angularjs"),
        @Script(id = "ideaadmin", value = "js/idea-front.js", depends = { "controllers" }),
        @Script(id = "ng-file-upload", value = "js/lib/ng-file-upload.js", depends = "angularjs"),
        @Script(id = "ng-file-upload-shim", value = "js/lib/ng-file-upload-shim.js", depends = "angularjs"),
        @Script(id = "fileSaver", value = "js/lib/FileSaver.js", depends = {"angularjs"}),
})

@Stylesheets({
        @Stylesheet(id = "jQueryUISkin", value = "style/jquery-ui.css") ,
        @Stylesheet(id = "ideaadminCss", value = "style/idea-front.css") ,

})
@Assets("*")
package org.exoplatform.addons.ideation.portlets.ideationAdministration;

        import juzu.Application;
        import juzu.asset.AssetLocation;
        import juzu.plugin.asset.Assets;
        import juzu.plugin.asset.Script;
        import juzu.plugin.asset.Scripts;
        import juzu.plugin.asset.Stylesheet;
        import juzu.plugin.asset.Stylesheets;
        import juzu.plugin.binding.Binding;
        import juzu.plugin.binding.Bindings;
        import juzu.plugin.portlet.Portlet;
        import org.exoplatform.ideation.service.IdeaService;
        import org.exoplatform.services.jcr.RepositoryService;
        import org.exoplatform.social.core.manager.IdentityManager;

