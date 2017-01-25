'''
Created on Jun 21, 2016

@author: Tharusha Shehan
'''
from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'^$', views.index, name='index'),
]