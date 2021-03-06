''' sana.tasks.admin

:author: Sana Development Team
:version: 2.0
:copyright: Sana 2012, released under BSD New License(http://sana.mit.edu/license)
'''
from django.contrib import admin
from .models import *

class EncounterTaskAdmin(admin.ModelAdmin):
    list_display = ( "procedure", "subject","created","due_on", "assigned_to")
    list_filter = ("procedure","subject","created","due_on", "assigned_to")
    date_hierarchy = ("due_on")

class ObservationTaskAdmin(admin.ModelAdmin):
    list_display = ("created","due_on", "assigned_to",)
    list_filter = ("created","due_on", "assigned_to",)
    date_hierarchy = ("due_on")

admin.site.register(EncounterTask, EncounterTaskAdmin)
admin.site.register(ObservationTask, ObservationTaskAdmin)
admin.site.register(Status)