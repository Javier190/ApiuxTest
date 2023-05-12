import { configureStore } from '@reduxjs/toolkit';
import rootReducer from './reducers';

const store = configureStore({
  reducer: rootReducer,
  middleware: [],
  devTools: process.env.NODE_ENV !== 'production',
});
//
export default store;

