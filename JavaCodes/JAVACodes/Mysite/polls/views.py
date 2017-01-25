'''
Created on Jun 21, 2016

@author: Tharusha Shehan
'''
from django.http import HttpResponse


def index(request):
    return HttpResponse("Hello, world. You're at the polls index.")