import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-thhackernews',
  templateUrl: './thhackernews.component.html',
  styleUrls: ['./thhackernews.component.css']
})
export class ThhackernewsComponent {
  constructor() {
  }

  // ngOnInit(): void {
  // }
  // article = {
  //   title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
  //   url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'
  // };
  articles = [
    {
      title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
      url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'
    },
    {
      title: 'Game of Life',
      url: 'https://thefullsnack.com/posts/game-of-life.html'
    },
    {
      title: 'Nguyên tắc thiết kế REST API',
      url: 'https://medium.com/eway/nguyên-tắc-thiết-kế-rest-api-23add16968d7'
    },
    {
      title: 'Why You Only Need to Test with 5 Users',
      url: 'https://www.nngroup.com/articles/why-you-only-need-to-test-with-5-users/'
    },
    {
      title: 'Let’s Build A Web Server. Part 1.',
      url: 'https://ruslanspivak.com/lsbaws-part1/'
    }
  ];

  // updateArticle() {
  //   // @ts-ignore
  //   this.article.title = document.getElementById('article-title').value;
  //   // @ts-ignore
  //   this.article.url = document.getElementById('article-url').value;
  // }
  // tslint:disable-next-line:ban-types

  // tslint:disable-next-line:no-unused-expression
  arr = {
    title: '',
    url: ''
  };
  likes = 0;
  addUrl(event: Event) {
    // @ts-ignore
    this.arr.url = event.target.value;
    // @ts-ignore
    console.log(event.target.value);
  }

  addtille(event: Event) {
    // @ts-ignore
    this.arr.title = event.target.value;
    // @ts-ignore
    console.log(event.target.value);
  }

  add() {
    console.log('Toio ddang dduowjc them tile :' + this.arr.url );
    console.log('Toio ddang dduowjc them url :' +  this.arr.title );
    // @ts-ignore
    this.articles.push(this.arr);
    console.log(this.arr);
    console.log(this.articles);
  }
  likeThis() {
    this.likes++;
  }
}
