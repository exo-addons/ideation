package org.exoplatform.addons.ideation.portlets.ideationAdministration.templates;
;out.print(org.exoplatform.addons.ideation.portlets.ideationAdministration.templates.Cindex.s0);

public class Cindex
{
public static final String s0 = '<div id="ideaAdmin">\n    <div ng-controller="ideaFrontCtrl" id="ideaFrontCtrl">\n        <div class="table-responsive">\n            <table class="table uiGrid table-hover table-striped">\n                <thead>\n                <tr>\n                    <th>title</th>\n                    <th>description</th>\n                    <th>Creator</th>\n                    <th>Status</th>\n                    <th>Creation Date</th>\n                    <th>Actions</th>\n                </tr>\n                </thead>\n                <tbody>\n                <tr ng-repeat="idea in ideas| orderBy:orderByField:reverseSort">\n                    <td>\n                         {{idea.title}}\n                    </td>\n                    <td>\n                        {{idea.description}}\n                    </td>\n                    <td>{{idea.createdBy}}</td>\n                    <td>{{idea.status}}</td>\n                    <td>{{idea.createdTime | date:\'dd-MM-yyyy HH:mm\'}}</td>\n                    <td>\n                        <a data-placement="bottom" rel="tooltip" class="new-idea actionIcon" data-original-title="Edit">\n                            <i class="uiIconEdit uiIconLightGray" data-ng-click="activeEditForm(idea)"></i>\n                        </a>\n                        <a class="actionIcon" title="" href="" data-ng-click="deleteIdea(idea)">\n                                <i class="uiIconDeleteUser uiIconLightGray"> </i>\n                            </a>\n\n                    </td>\n                </tr>\n                </tbody>\n            </table>\n        </div>\n\n        <br>\n\n        <div class="new-idea-container col-md-12" style="display: none;">\n                <div class="new-idea-input panel panel-primary">\n                    <div class="panel-body">\n                        <form novalidate>\n                            <div class="form-group">\n                                <input class=" input-xxlarge" type="hidden" placeholder="" ng-model="id">\n                            </div>\n                            <div class="form-group">\n                                <input class="input-xxlarge" type="text" placeholder="" ng-model="title">\n                            </div>\n                            <div class="form-group">\n                                <input class="input-xxlarge" type="text" placeholder="" ng-model="createdBy">\n                            </div>\n                            <div class="form-group">\n                                <textarea  rows="5" ng-model="description" ></textarea>\n                            </div>\n                            <label>\n                                <select ng-selected="status" ng-model="status">\n                                    <option>DRAFTED</option>\n                                    <option>ARCHIVED</option>\n                                    <option>PUBLISHED</option>\n                                </select>\n                            </label>\n                            <div>\n                                <button class="idea-up btn btn-primary" ng-click="updateIdea()">Update</button>\n                            </div>\n                        </form>\n                    </div>\n                </div>\n        </div>\n</div>\n</div>';
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [:];
}
